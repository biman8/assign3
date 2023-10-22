public class Main {
    public static void main(String[] args) {
        USBTypeAComputer computer = new USBTypeAComputer();
        USBTypeCAdapter adapter = new USBTypeCAdapter(computer);

        // Connect the smartphone to the computer using the adapter
        adapter.sendData("50gb from smartphone");
        String receivedData = adapter.receiveData();
        System.out.println("Received data on smartphone: " + receivedData);
    }
}



