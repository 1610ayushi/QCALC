package tayushi1610.ME_QCALC_QA;
public class StandardCalculator {

   private int result;

   public void add(int num1, int num2){

	result = num1 + num2;

   }

   public void subtract(int num1, int num2){

	result = num1 - num2;

   }

   public void multiply(int num1, int num2){

	result = num1 * num2;

   }

   public void divide(int num1, int num2){

	result = num1 / num2;

   }

   public int getResult() {

       return result;

   }   
public void setResult(int value) {

    if (value != 0)

        return;   

    this.result = value;
}

public void clearResult() {

    result = 0;

}

public void printResult(){

    System.out.println("Standard Calculator Result:"+ result);

}



// other arithmetic operation methods

  

}
