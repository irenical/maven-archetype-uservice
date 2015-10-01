package ${package};

import java.sql.SQLException;
import java.util.List;

import org.apache.thrift.TException;
import org.irenical.lifecycle.LifeCycle;

import ${package}.thrift.T${rootArtifactId};

public class T${rootArtifactId}Service implements T${rootArtifactId}.Iface, LifeCycle {

  @Override
  public String hello(String name) throws TException {
    return "Hello " + name;
  }

  @Override
  public void start() {
  }

  @Override
  public void stop() {
  }
    
  @Override
  public boolean isRunning(){
    return true;
  }

}
