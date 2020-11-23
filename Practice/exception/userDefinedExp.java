class myException extends Exception {

}

class Demo {
        public static void main(String[] args) {
                try {
                        throw new myException();
                        //throw new myException();
                        //System.out.println("hii");
                }catch(myException | ArrayIndexOutOfBoundsException e ) {
                        System.out.println("My exception");
                }
                catch(Exception e) {
                        System.out.println("Exception");
                }
        }

}
