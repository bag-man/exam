public abstract class Brick { 

  protected Connector studs[][] = new Connector[10][10];
  protected Connector sockets[][] = new Connector[10][10];
  protected String serialNumber;
  protected Colour colour;

  protected void clip(Position topSocket, Brick bottomBrick, Position bottomStud, Direction direction) {

    Connector topConnector = this.getSocketPosition(topSocket);
    Connector bottomConnector = bottomBrick.getStudPosition(bottomStud);

    topConnector.clipTo(bottomConnector);
    bottomConnector.clipTo(topConnector);

    if(direction == Direction.WIDTH_WISE) {
      System.out.println("Connecting width ways");
    }

  }

  private Connector getStudPosition(Position p) {
    return studs[p.getX()][p.getY()];
  }

  private Connector getSocketPosition(Position p) {
    return sockets[p.getX()][p.getY()];
  }

}
