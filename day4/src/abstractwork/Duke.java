package abstractwork;

class Duke extends Bike {

    @Override
    void run() {
        System.out.println("running safely");
    }

    void driver() {
        System.out.println("Driver is riding Duke");
    }
    public static void main(String[] args) {
		Bike b=new Duke();
		Duke d=new Duke();
		b.run();
		d.driver();
	}
}
