package com.durgajava8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
 
    public static void main(String[] args) {
        
        List<CricketKit> kits = new ArrayList<>();
        CricketKit kit1 = new CricketKit("Bat", "Helmet", "K1");
        CricketKit kit2 = new CricketKit("Gloves", "Pads", "K2");
        CricketKit kit3 = new CricketKit("Ball", "Stumps", "K3");
        
        kits.add(kit1);
        kits.add(kit2);
        kits.add(kit3);

        Supplier<CricketKit> kitSupplier = () -> {
            CricketKit kit = null;
            if (!kits.isEmpty()) {
                kit = kits.get(0);
                kits.remove(0);
            }
            return kit;
        };

        for (int i = 0; i < 10; i++) {
            CricketKit suppliedKit = kitSupplier.get();
            
            if (suppliedKit != null) {
                System.out.println(suppliedKit);
            } else {
                System.out.println("out of stock");
                
            }
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
}

class CricketKit {
    private String kit1;
    private String kit2;
    private String kitId;

    public String getKit1() {
		return kit1;
	}


	public void setKit1(String kit1) {
		this.kit1 = kit1;
	}


	public String getKit2() {
		return kit2;
	}


	public void setKit2(String kit2) {
		this.kit2 = kit2;
	}


	public String getKitId() {
		return kitId;
	}


	public void setKitId(String kitId) {
		this.kitId = kitId;
	}


	public CricketKit(String kit1, String kit2, String kitId) {
        this.kit1 = kit1;
        this.kit2 = kit2;
        this.kitId = kitId;
    }

  
    @Override
    public String toString() {
        return "CricketKit [Primary Equipment=" + kit1 + ", Secondary Equipment=" + kit2 + ", Kit ID=" + kitId + "]";
    }
}
