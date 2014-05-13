public class Rectangle extends Brick {

  private int x,y;

  public Rectangle(int X, int Y, boolean smoothTop,boolean smoothBottom, String serialNum, Colour colr){
    serialNumber = serialNum;
    colour = colr;

    for(int i = 0; i < X; i++){
      for(int n = 0; n < Y; n++){
	if(smoothTop)
	  studs[i][n] = new Connector(ConnectorType.SMOOTH, this);
	else
	  studs[i][n] = new Connector(ConnectorType.STUD, this);

	if(smoothBottom)
	  sockets[i][n] = new Connector(ConnectorType.SMOOTH, this);
	else
	  sockets[i][n] = new Connector(ConnectorType.SOCKET, this);
      }
    }

  }
}
