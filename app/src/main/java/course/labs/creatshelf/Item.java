package course.labs.creatshelf;

import java.util.Comparator;

/**
 * Created by suren on 5/7/15.
 */
public class Item{

    private String cover_1;
    private String cover_2;
    private String cover_3;
    private String coverString1;
    private String coverString2;
    private String coverString3;

    public String getCoverString1() {
        return coverString1;
    }

    public String getCoverString2() {
        return coverString2;
    }

    public String getCoverString3() {
        return coverString3;
    }

    public Item(String cover_1, String cover_2, String cover_3, String coverString1, String coverString2, String coverString3) {
        this.cover_1 = cover_1;
        this.cover_2 = cover_2;
        this.cover_3 = cover_3;
        this.coverString1 = coverString1;
        this.coverString2 = coverString2;
        this.coverString3 = coverString3;
    }

    public String getCover_3() {
        return cover_3;
    }

    public String getCover_1() {
        return cover_1;
    }

    public String getCover_2() {
        return cover_2;
    }

}
