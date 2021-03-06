package util;

/**
 * Operator enum of the different kind of operations.
 * 
 * @author John Curley
 */
public enum Operator
{

  ADDITION('+', "Addition"), SUBTRACTION('-', "Subtraction"), MULTIPLICATION('x',
      "Multiplication"), DIVISION('/', "Division"), EXPONENT('^', "Exponent"), LOGARITHM('l',
          "Logarithm"), INVERSE('v', "Inverse"), CONJUGATE('c',
              "conjugate"), SQUAREROOT('2', "Square Root"), NOTHING('0', "Nothing");

  private char symbol;
  private String type;

  /**
   * Constructor.
   * 
   * @param symbol
   *          char Operator symbol
   * @param type
   *          String name of Operator result
   */
  private Operator(final char symbol, final String type)
  {
    this.symbol = symbol;
    this.type = type;
  }

  /**
   * Creates an Operator from the operation symbol.
   * 
   * @param operatorSymbol
   *          char Operator symbol
   * @return Operator 
   */
  public Operator fromSymbol(final char operatorSymbol)
  {

    Operator op;

    switch (operatorSymbol)
    {
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
      case '^':
        op = Operator.EXPONENT;
        break;
      case 'l':
        op = Operator.LOGARITHM;
        break;
      case 'v':
        op = Operator.INVERSE;
        break;
      case 'c':
        op = Operator.CONJUGATE;
        break;
      case '2':
        op = Operator.SQUAREROOT;
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
  public char getSymbol()
  {
    return symbol;
  }

  /**
   * Gets the result name of the Operator.
   * 
   * @return result name
   */
  public String getType()
  {
    return type;
  }

  /**
   * Returns just the Operator symbol.
   * 
   * @return String - formated string
   */
  public String toString()
  {
    return "" + symbol;
  }
}
