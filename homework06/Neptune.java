public class Neptune {
    public int distance(String value) {
        BrobInt b = new BrobInt("11186");
        int counter = 0;
        while(b.internalValue.compareTo(new BrobInt("149896229")) == 1)  {
            for (int i = 11186; i < Integer.parseInt(value); i++) {
                b.add(b);
                counter++;
            }
        }

        while(b.internalValue.compareTo(new BrobInt("23500"))) {
            for (int i = Integer.parseInt(value); i > 0; i-- ) {
                b.subtract(new BrobInt("11186"));
                counter++;
            }
        }
        return counter;
    }
    public static void main (String [] args) {
        BrobInt b = new BrobInt("11186");
        System.out.println(b.distance(args[0]));
    }
}
