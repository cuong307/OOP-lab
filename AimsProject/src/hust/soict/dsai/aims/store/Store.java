package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
	private ArrayList<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }
    
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("The media has been added to the store.");
    }

    public void removeMedia(Media media) {
        boolean removed = itemsInStore.remove(media);
        if (removed) {
            System.out.println("The media has been removed from the store.");
        } else {
            System.out.println("The media is not found in the store.");
        }
    }
    
    public void removeMedia(String title) {
        Media mediaToRemove = null;
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                mediaToRemove = media;
                break;
            }
        }

        if (mediaToRemove != null) {
            boolean removed = itemsInStore.remove(mediaToRemove);
            if (removed) {
                System.out.println("Media '" + mediaToRemove.getTitle() + "' has been removed from the store.");
            } else {
                System.out.println("Failed to remove media '" + mediaToRemove.getTitle() + "' from the store.");
            }
        } else {
            System.out.println("Media with title '" + title + "' is not found in the store.");
        }
    }
    
    public float totalCost() {
        float total = 0; 
        for (Media media : itemsInStore) {
            total += media.getCost();
        }
        return total;
    }
    
    public void displayMedia() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty");
        } else {
            System.out.println("Media in the store:");
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i));
            }
        }
    }
}
//    private DigitalVideoDisc[] itemsInStore;
//    private int count;
//
//    public Store(int maxcapacity) {
//        itemsInStore = new DigitalVideoDisc[maxcapacity];
//        count = 0;
//    } 
//
//    public void addDVD(DigitalVideoDisc dvd) {
//        if (count < itemsInStore.length) {
//            itemsInStore[count] = dvd;
//            count++;
//            System.out.println("DVD" + count + " has been added to the store.");
//        } else {
//            System.out.println("The store is already full.");
//        }
//    }
//
//    public void removeDVD(DigitalVideoDisc dvd) {
//        int index = -1;
//        for (int i = 0; i < count; i++) {
//            if (itemsInStore[i].equals(dvd)) {
//                index = i;
//                break;
//            }
//        }
//        if (index != -1) {
//            for (int i = index; i < count - 1; i++) {
//                itemsInStore[i] = itemsInStore[i + 1];
//            }
//            itemsInStore[count - 1] = null;
//            count--;
//            System.out.println("DVD" + count + " has been removed from the store.");
//        } else {
//            System.out.println("DVD is not found in the store.");
//        }
//    }
//    
//    public float totalCost() {
//		float sum = 0;
//		for (int i = 0; i < count;i++) {
//			sum += itemsInStore[i].getCost();
//		}
//		return sum;
//			
//	}
//    public void displayDVDs() {
//        if (count == 0) {
//            System.out.println("The store is empty. No DVDs available.");
//        } else {
//            System.out.println("DVDs in the store:");
//            for (int i = 0; i < count; i++) {
//                System.out.println((i + 1) + ". " + itemsInStore[i]);
//            }
//        }
//        System.out.println("Total cost: " + totalCost() );
//    }