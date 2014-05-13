public class Connector {

  private ConnectorType type;
  private Brick parent;
  private Connector clippedTo;

  public Connector(ConnectorType t, Brick p) {
    type = t;
    parent = p;
  }

  public void clipTo(Connector match) {
    clippedTo = match;
  }

}
