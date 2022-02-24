public class ArgsLastPrinter{
    public static void main(String [] args){
      System.out.println(args);
      if (args.length == 0){
        System.out.println("なし");
      } else {
        System.out.println(args [args.length -1]);
      }
    }
}