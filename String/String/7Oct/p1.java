//command line argument is an array of string

class StringArrayDemo {
        public static void main(String[] args) {
                
                System.out.println("command line arguments");
                for(int i=0; i<args.length; i++) {
                        System.out.println(args[i]);
                }
        }
}
