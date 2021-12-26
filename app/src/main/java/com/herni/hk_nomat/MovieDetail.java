package com.herni.hk_nomat;

public class MovieDetail {
    private String name;
    private int imageResourceId;
    public static final MovieDetail[] allmovies = {
            new MovieDetail("Spider-Man: No Way Home", R.drawable.spiderman),
            new MovieDetail("The Matrix Resurrections", R.drawable.thematrix),
            new MovieDetail("The Kings Man", R.drawable.kingsman),
            new MovieDetail("Radiactive", R.drawable.radioactive),
            new MovieDetail("Teka Teki Tika", R.drawable.tekatekitika),
            new MovieDetail("Ghost Busters: Afterlife", R.drawable.ghostbuster)

    };

    public static final MovieDetail[] horror = {
            new MovieDetail("Teka Teki Tika", R.drawable.tekatekitika),
            new MovieDetail("Ghost Busters: Afterlife", R.drawable.ghostbuster)
    };

    public static final MovieDetail[] adventure = {
            new MovieDetail("Spider-Man: No Way Home", R.drawable.spiderman),
            new MovieDetail("The Matrix Resurrections", R.drawable.thematrix),
            new MovieDetail("The Kings Man", R.drawable.kingsman)
    };

    public static final MovieDetail[] sci_fi = {
            new MovieDetail("Radioctive", R.drawable.radioactive),
            new MovieDetail("Dune", R.drawable.dune)

    };
    private MovieDetail(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
