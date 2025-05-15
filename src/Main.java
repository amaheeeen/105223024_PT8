// Superclass
class Vehicle {
    public String startEngine() {
        return "Mesin Nyala";
    }
}

class Car extends Vehicle {
    @Override
    public String startEngine() {
        return "Mesin Mobil Nyala";
    }
}

class Motorcycle extends Vehicle {
    @Override
    public String startEngine() {
        return "Mesin Motor Nyala";
    }
}

class License {
    String licenseNumber;
    String validUntil;

    public License(String licenseNumber, String validUntil) {
        this.licenseNumber = licenseNumber;
        this.validUntil = validUntil;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getValidUntil() {
        return validUntil;
    }
}

class Driver {
    String name;
    Vehicle vehicle;
    License license;

    public Driver(String name, Vehicle vehicle, String licenseNumber, String validUntil) {
        this.name = name;
        this.vehicle = vehicle;
        this.license = new License(licenseNumber, validUntil); // komposisi
    }

    public void displayInfo() {
        System.out.println("Nama Pengemudi : " + name);

        if (vehicle instanceof Car) {
            System.out.println("Jenis Kendaraan: Car");
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Jenis Kendaraan: Motorcycle");
        }

        System.out.println("Status Mesin   : " + vehicle.startEngine());
        System.out.println("No. Lisensi    : " + license.getLicenseNumber());
        System.out.println("Berlaku Sampai : " + license.getValidUntil());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Tanggal dibuat manual
        Driver d1 = new Driver("Jeremiah", new Car(), "L123456", "15-05-2030");
        Driver d2 = new Driver("Nawaytu", new Motorcycle(), "L654321", "20-11-2029");
        Driver d3 = new Driver("Karim", new Motorcycle(), "L987654", "01-01-2031");

        d1.displayInfo();
        d2.displayInfo();
        d3.displayInfo();
    }
}
