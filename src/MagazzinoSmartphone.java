public class MagazzinoSmartphone {
    private Smartphone[] smartphones;
    private int count;

    public MagazzinoSmartphone() {
        smartphones = new Smartphone[10]; // Assuming initial capacity of 10
        count = 0;
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
        
    }


    public void addSmartphone(Smartphone smartphone) {
        int i = 0;
        boolean aggiunto = false;
        while (aggiunto == false) {
            if (smartphones[i]==null) {
                smartphones[i]=smartphone;
                aggiunto = true;
            }
            i++;
        }
    } 
       
    

    public void removeSmartphone(Smartphone smartphone) {
       int i = 0;
       boolean tolto = false;
       while(tolto==false) {
        if (smartphones[i]==smartphone) {
            smartphones[i]=null;
            tolto=true;
        }
        i++;
       }
    }

    public Smartphone[] getSmartphonesArray() {
        Smartphone[] smartphoneArray = new Smartphone[count];
        System.arraycopy(smartphones, 0, smartphoneArray, 0, count);
        return smartphoneArray;
    }


    public Smartphone getSmartphoneByBrand(String brand) {
        Smartphone smartphone = null;
        for (int i = 0; i < smartphones.length; i++) {
            if (smartphones[i]!=null && smartphones[i].getBrand().equals(brand)) {
                smartphone=smartphones[i];
            }
        }
        return smartphone;
    }

    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        for (int i = 0; i < smartphones.length; i++) {
            if (smartphones[i]!=null && smartphones[i].getStorageCapacity()==storageCapacity) {
                magazzinoSmartphone.addSmartphone(smartphones[i]);
            }
        }

        return magazzinoSmartphone;
    }

    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        for (int i = 0; i < smartphones.length; i++) {
            if (smartphones[i]!=null && smartphones[i].getPrice()>=minPrice && smartphones[i].getPrice()<=maxPrice) {
                magazzinoSmartphone.addSmartphone(smartphones[i]);
            }
        }
        return magazzinoSmartphone;
    }

    @Override
    public String toString() {
        String result = "\nMagazzinoSmartphone:\n";
        for (int i = 0; i < smartphones.length; i++) {
            if (smartphones[i]!=null) {
                result = result + smartphones[i] + "\n";
            }
        }
        return result;
    }

    public int getCount() {
        for (int i = 0; i < smartphones.length; i++) {
            if (smartphones[i]!=null) {
                count=count+1;
            }
        }
        return count;
    }

    public boolean equals(Object obj) {
        return true;
    }


}