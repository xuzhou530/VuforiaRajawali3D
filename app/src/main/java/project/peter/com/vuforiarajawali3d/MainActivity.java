package project.peter.com.vuforiarajawali3d;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_image_target = (Button)findViewById(R.id.bt_image_target);
        bt_image_target.setOnClickListener(this);

        Button bt_cloud_reco = (Button)findViewById(R.id.bt_cloud_reco);
        bt_cloud_reco.setOnClickListener(this);

        Button bt_framemarker_target = (Button)findViewById(R.id.bt_framemarker_target);
        bt_framemarker_target.setOnClickListener(this);

        Button bt_virtual_button = (Button)findViewById(R.id.bt_virtual_button);
        bt_virtual_button.setOnClickListener(this);

        Button bt_userdefined_target = (Button)findViewById(R.id.bt_userdefined_target);
        bt_userdefined_target.setOnClickListener(this);

        Button bt_cylinder_target = (Button)findViewById(R.id.bt_cylinder_target);
        bt_cylinder_target.setOnClickListener(this);

        Button bt_cuboid_target = (Button)findViewById(R.id.bt_cuboid_target);
        bt_cuboid_target.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_image_target:
                startActivity(new Intent(MainActivity.this, ImageTargetActivity.class));
                break;
            case R.id.bt_cloud_reco:
                startActivity(new Intent(MainActivity.this, CloudRecoActivity.class));
                break;
            case R.id.bt_framemarker_target:
                startActivity(new Intent(MainActivity.this, FrameMarkerActivity.class));
                break;
            case R.id.bt_virtual_button:
                startActivity(new Intent(MainActivity.this, VirtualButtonActivity.class));
                break;
            case R.id.bt_userdefined_target:
                startActivity(new Intent(MainActivity.this, UserDefinedTargetActivity.class));
                break;
            case R.id.bt_cylinder_target:
                startActivity(new Intent(MainActivity.this, CylinderTargetActivity.class));
                break;
            case R.id.bt_cuboid_target:
                startActivity(new Intent(MainActivity.this, CuboidTargetActivity.class));
                break;
        }
    }
}
