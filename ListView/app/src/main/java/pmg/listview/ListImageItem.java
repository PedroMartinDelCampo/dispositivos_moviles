package pmg.listview;

/**
 * Created by pedro on 25/09/16.
 */

public class ListImageItem {

    private int image;
    private String label;

    public ListImageItem(int image, String label) {
        this.image = image;
        this.label = label;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
