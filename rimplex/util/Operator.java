package util;

/**
 * Operator enum of the different kind of operations.
 * 
 * @author John Curley
 */
public enum Operator {

  ADDITION('+', "sum"), SUBTRACTION('-', "difference"),
  MULTIPLICATION('x', "product"), DIVISION('/', "quoitent");

  private char symbol;
  private String type;

  /**
   * Constructor.
   * 
   * @param symbol char Operator symbol
   * @param type String name of Operator result
   */
  private Operator(char symbol, String type) {
    this.symbol = symbol;
    this.type = type;
  }

  /**
   * Creates an Operator from the operation symbol.
   * 
   * @param symbol char Operator symbol
   * @return Operator
   */
  public Operator fromSymbol(char symbol) {

    Operator op;

    switch (symbol) {
      case '+':
        op = Operator.ADDITION;
        break;
      case '-':
        op = Operator.SUBTRACTION;
        break;
      case '*':
        op = Operator.MULTIPLICATION;
        break;
      case 'x':
        op = Operator.MULTIPLICATION;
        break;
      case '/':
        op = Operator.DIVISION;
        break;
      default:
        op = null;
        break;
    }

    return op;
  }

  /**
   * Gets the symbol of the Operator.
   * 
   * @return symbol
   */
  public char getSymbol() {
    return symbol;
  }

  /**
   * Gets the result name of the Operator.
   * 
   * @return result name
   */
  public String getResultType() {
    return type;
  }

  /**
   * Returns just the Operator symbol.
   */
  public String toString() {
    return "" + symbol;
  }
}