class USBTypeCAdapter implements USBTypeC {
    private USBTypeAComputer computer;

    USBTypeCAdapter(USBTypeAComputer computer) {
        this.computer = computer;
    }

    @Override
    public void sendData(String data) {
        computer.sendDataToComputer(data);
    }

    @Override
    public String receiveData() {
        return computer.receiveDataFromComputer();
    }
}




