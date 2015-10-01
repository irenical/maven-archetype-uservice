package ${package};

import org.irenical.jindy.ConfigFactory;
import org.irenical.lifecycle.builder.CompositeLifeCycle;
import org.irenical.thrifty.ThriftServerLifeCycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ${package}.thrift.T${rootArtifactId};

public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    try {

      T${rootArtifactId}Service service = new T${rootArtifactId}Service();
      ThriftServerLifeCycle thrift = new ThriftServerLifeCycle(new T${rootArtifactId}.Processor<T${rootArtifactId}.Iface>(service), ConfigFactory.getConfig(), "${rootArtifactId}");

      CompositeLifeCycle life = new CompositeLifeCycle();
      life.append(service);
      life.append(thrift);
      life.withShutdownHook();
      life.start();

    } catch (Exception e) {
      LOG.error("Error setting up service", e);
    }
  }

}
