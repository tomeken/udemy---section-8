public class B extends A implements Szyfrator{
    public B(int value) {
        super (value);
     //   System.out.println (this.value);
    }

    @Override
    public void code() {
     this.value=this.value*13;
   //     System.out.println (this.value );
    }

    @Override
    public void decode() {
        this.value=this.value/13;
     //   System.out.println (this.value );
    }

}
