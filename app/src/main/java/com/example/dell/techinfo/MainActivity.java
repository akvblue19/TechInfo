package com.example.dell.techinfo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageButton i1,i2,i3,i4,i5;
    Button b;
    int []imageArray={R.drawable.ai,R.drawable.android,R.drawable.cloud,R.drawable.iot,R.drawable.speech};
    int stringIdList[] = {R.string.text1, R.string.text2, R.string.text3, R.string.text4};
    int image[]={R.drawable.imagenews1,R.drawable.imagenews2,R.drawable.imagenews3,R.drawable.imagenews4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
       /*FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.main, new home_fragement(),"fragA");
        ft.commit();*/
        ImageButton i1,i2,i3,i4,i5;
        Button b,news1,news2,news3,news4,news5,news6;

        news1=(Button)findViewById(R.id.homenews1);
        news2=(Button)findViewById(R.id.homenews2);
        news3=(Button)findViewById(R.id.homenews3);
        news4=(Button)findViewById(R.id.homenews4);
        news5=(Button)findViewById(R.id.homenews5);
        news6=(Button)findViewById(R.id.homenews6);
        final int []imageArray={R.drawable.artii,R.drawable.android,R.drawable.cloud,R.drawable.iot,R.drawable.speech};
        b=(Button)findViewById(R.id.bt_tech);
        final ImageView imageView = (ImageView)findViewById(R.id.img);
        final Handler handler = new Handler();
        Runnable runnable = new Runnable()
        {
            int i=0;
            public void run()
            {
                imageView.setImageResource(imageArray[i]);
                i++;
                if(i>imageArray.length-1)
                {
                    i=0;
                }
                handler.postDelayed(this, 3000);  //for interval...
            }


        };

        handler.postDelayed(runnable, 0); //for initial delay..

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.main,new technology_list());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        ImageButton btf= (ImageButton) findViewById(R.id.fb);
        btf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.facebook.com/TechInfo-364270304024493/?ref=bookmarks"));
                startActivity(i);

            }
        });
       /* ImageButton btf1= (ImageButton) findViewById(R.id.twitter);
        btf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://twitter.com/TechInf56412653"));
                startActivity(i);

            }
        });*/
        news1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          FragmentManager fm=getSupportFragmentManager();
          android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
          ft.replace(R.id.main,new news1());
          ft.addToBackStack(null);
          ft.commit();
        }
        });
        news2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.main,new news2());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        news3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.main,new news3());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        news4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.main,new news4());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        news5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.main,new news5());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        news6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.main,new news6());
                ft.addToBackStack(null);
                ft.commit();
            }
        });


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

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.contactus) {
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.main,new contactus());
            ft.addToBackStack(null);
            ft.commit();
        }
        if (id == R.id.aboutus) {
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.main,new aboutus());
            ft.addToBackStack(null);
            ft.commit();
        }

        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.main,new Blank());
            ft.addToBackStack(null);
            ft.commit();


        } else if (id == R.id.nav_technologies) {
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.main,new technology_list());
            ft.addToBackStack(null);
            ft.commit();
        } else if (id == R.id.nav_newsfeed) {
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.main,new newsfeed());
            ft.addToBackStack(null);
            ft.commit();
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_rate) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }




}
