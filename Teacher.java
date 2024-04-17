class Teacher extends Person {
    private String maGV;
    private double heSoLuong;

    public Teacher(String name, int age, String phoneNumber, String maGV, double heSoLuong) {
        super(name, age, phoneNumber);
        this.maGV = maGV;
        this.heSoLuong = heSoLuong;
    }

    public double heSoLuong() {
        // Assuming a base salary is 10,000 units
        return 10000 * heSoLuongt;
    }
}
