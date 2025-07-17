package local.streams;

  import java.util.Arrays;
  import java.util.stream.IntStream;

    // https://dev.java/learn/api/streams

   public class Demo01Streams {

    private int[] nambers [1, 2, 34, 67,];
      IntStream sNumbers = Arrays stream(nambers);


      public int  sumSquqresGreaterThan (intlimit, IntStream sNumbers ) {
        .map(num-> num * num)
        .filter(num -> num > limit)
        .reduce((acc, num) -> acc += num)
        .orElse(-1
      }


   public void makeMap() {
    IntStream sNambersNew = sNumber.map(number -> number * number);
}


   public void makeFilter() {
    IntStream sNumbersNew = sNumber.filter(number -> number > 10);
    makeFilterEach(sNumbersNew);
   }

      public void make() {
    IntStream sNambersNew = sNumber.map(number -> number * number);


  


   public void makeForEach() {
    sNumbers.forEach(nambers -> System.out.println(number));
        
    
  }
  

  public static void main(String[] args) {
    
  }
}
