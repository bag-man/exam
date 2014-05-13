public abstract class Brick { 

  protected Connector studs[][];
  protected Connector sockets[][];
  protected String serialNumber;
  protected Colour colour;

  protected Brick() {
    studs = new Connector[10][10];
    sockets = new Connector[10][10];
  }

  protected void clip(Position topSocket, Brick bottomBrick, Position bottomStud, Direction direction) {

    Connector topConnector = this.getSocketPosition(topSocket);
    Connector bottomConnector = bottomBrick.getStudPosition(bottomStud);

    topConnector.clipTo(bottomConnector);
    bottomConnector.clipTo(topConnector);

  }

  private Connector getStudPosition(Position p) {
    return studs[p.getX()][p.getY()];
  }

  private Connector getSocketPosition(Position p) {
    return sockets[p.getX()][p.getY()];
  }

}
