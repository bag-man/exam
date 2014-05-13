public class Rectangle extends Brick {

  private int x,y;

  public Rectangle(int X, int Y, boolean smoothTop,boolean smoothBottom, String serialNum, Colour colr){
    super();
    serialNumber = serialNum;
    colour = colr;

    for(int i = 0; i < x; i++){
      for(int n = 0; n < y; n++){
	if(smoothTop)
	  studs[x][y] = new Connector(ConnectorType.SMOOTH, this);
	else
	  studs[x][y] = new Connector(ConnectorType.STUD, this);

	if(smoothBottom)
	  sockets[x][y] = new Connector(ConnectorType.SMOOTH, this);
	else
	  sockets[x][y] = new Connector(ConnectorType.SOCKET, this);
      }
    }

  }
}
