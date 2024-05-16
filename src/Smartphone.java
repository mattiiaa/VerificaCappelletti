public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private double price;

    public Smartphone(){};

    public Smartphone(String brand, String model, int storageCapacity, double price) {
        this.brand=brand;
        this.model=model;
        this.storageCapacity=storageCapacity;
        this.price=price;
    }

    public Smartphone(Smartphone other) {
        brand=other.brand;
        model=other.model;
        storageCapacity=other.storageCapacity;
        price=other.price;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Model: " + this.model + ", Storage Capacity: " + this.storageCapacity + "GB, Price: " + this.price;
    }

    @Override
    public boolean equals(Object obj) {
        boolean r = false;
        if (this == obj) {
            r = true;
        } else if (obj instanceof Smartphone) {
            Smartphone p = (Smartphone) obj;
            if (this.getBrand().equals(p.getBrand()) && this.getModel().equals(p.getModel())
            && this.price==p.price && this.storageCapacity==p.storageCapacity);
        } 
        return r;
    }
    
}
