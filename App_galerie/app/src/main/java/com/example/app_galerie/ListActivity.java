package com.example.app_galerie;

import static androidx.constraintlayout.widget.Constraints.TAG;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ShareCompat;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.example.app_galerie.adapter.StarAdapter;
import com.example.app_galerie.beans.Star;
import com.example.app_galerie.service.StarService;

public class ListActivity extends AppCompatActivity {

    private List<Star> stars;
    private RecyclerView recyclerView;
    private StarAdapter starAdapter = null;
    private StarService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Initialisation de la Toolbar
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        stars = new ArrayList<>();
        service = StarService.getInstance();
        init();

        // Configuration de la RecyclerView
        recyclerView = findViewById(R.id.recycle_view);
        starAdapter = new StarAdapter(this, service.findAll());
        recyclerView.setAdapter(starAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Log.d(TAG, "Stars in adapter: " + service.findAll().size());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (starAdapter != null){
                    starAdapter.getFilter().filter(newText);
                }
                return true;
            }
        });
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.app_bar_share){
            String txt = "Stars";
            String mimeType = "text/plain";
            ShareCompat.IntentBuilder
                    .from(this)
                    .setType(mimeType)
                    .setChooserTitle("Stars")
                    .setText(txt)
                    .startChooser();
        }
        return super.onOptionsItemSelected(item);
    }


    public void init() {
        // Ajout de données au service
        service.Create(new Star("Achraf Hakimi", "https://tse2.mm.bing.net/th?id=OIP.K3ZTOjaCV_glINugSeevbQHaEK&pid=Api&P=0&h=180", 3.5f));
        service.Create(new Star("Hakim Ziach", "https://tse4.mm.bing.net/th?id=OIP.YL7avGTEeyWH4oVKukxwKQHaJ3&pid=Api&P=0&h=180", 3));
        service.Create(new Star("Yassine Bono", "https://tse2.mm.bing.net/th?id=OIP.wmTXx_7vCvNOhmCk_U9RMwHaE7&pid=Api&P=0&h=180", 5));
        service.Create(new Star("Youssef Ennaciri", "https://tse4.mm.bing.net/th?id=OIP.O8QtgUVDBCmXXcvoo-55cwHaJN&pid=Api&P=0&h=180", 1));
        service.Create(new Star("Azzedine Ounahi", "https://tse1.mm.bing.net/th?id=OIP.PmFZ71adiXQJGTUPO3tgXgAAAA&pid=Api&P=0&h=180", 5));
        service.Create(new Star("Zakaria Aboukhlal ", "https://i.pinimg.com/564x/0a/41/ff/0a41ffdcc93466573a95ed7bb804d271.jpg", 1));

        Log.d(TAG, "Stars created: " + service.findAll().size());
    }
}