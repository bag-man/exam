public class TestProgram {

  public static void main(String[] args) {

    Rectangle brick1 = new Rectangle(2, 3, false, false, "0001", Colour.BLUE);
    Rectangle brick2 = new Rectangle(4, 3, false, false, "0002", Colour.RED);

    brick1.clip(new Position(0, 0), brick2, new Position(2, 1), Direction.LENGTH_WISE);

  }

}
