package uofsc.com.breatheasynologin;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainMenuNavigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        initFrag();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu_navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.navMindfulness) {
            goToMindfulness();
        } else if (id == R.id.navDaily) {
            goToDaily();
        } else if (id == R.id.navCommunities) {
            goToCommunities();
        } else if (id == R.id.navSettings) {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();


        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void goToCommunities() {
        Fragment communities = new communitiesFragment();
        FragmentTransaction ft3 = getFragmentManager().beginTransaction();
        ft3.replace(R.id.constraintLayout, communities);
        ft3.commit();

    }

    private void goToDaily() {
        Fragment daily = new dailyFragment();
        FragmentTransaction ft2 = getFragmentManager().beginTransaction();
        ft2.replace(R.id.constraintLayout, daily);
        ft2.commit();
    }

    private void goToMindfulness() {
        Fragment mindfulness = new mindfulnessFragment();
        FragmentTransaction ft1 = getFragmentManager().beginTransaction();
        ft1.replace(R.id.constraintLayout, mindfulness);
        ft1.commit();

    }
    private void initFrag(){
        Fragment fragment;
        fragment = new mainScreen();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.constraintLayout,fragment);
        ft.commit();
    }
    }


