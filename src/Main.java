public class Main {

    public static void main(String[] args) {
        // Make threads with the names
        ChickenEgg chicken = new ChickenEgg("Chicken");
        ChickenEgg egg = new ChickenEgg("Egg");
        System.out.println("Start the dispute: who appeared first?");
        // Start the threads
        chicken.start();
        egg.start();
        // While both threads is working
        while (chicken.isAlive() || chicken.isAlive()) {
            try {
                // Suspend judge thread
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        // Does Egg won?
        if (egg.isAlive()) {
            try {
                // Stop the egg
                egg.interrupt();
                // Waiting for silence
                egg.join();
            } catch (InterruptedException e) {
            }

            System.out.println("An egg appeared first!");
        } else {
            try {
                // Stop the chicken
                chicken.interrupt();
                // Waiting for silence
                chicken.join();
            } catch (InterruptedException e) {
            }
            System.out.println("A chicken appeared first!");
        }
        System.out.println("The dispute is over");
    }
}