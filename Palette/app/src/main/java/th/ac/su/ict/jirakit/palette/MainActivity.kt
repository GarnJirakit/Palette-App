package th.ac.su.ict.jirakit.palette

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                color.setBackgroundColor(Color.parseColor("#e9e1de"))
                color.setText("233-225-222")
            }
        })
        b2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                color.setBackgroundColor(Color.parseColor("#e7cccb"))
                color.setText("231-204-203")
            }
        })

        b3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                color.setBackgroundColor(Color.parseColor("#77839a"))
                color.setText("119-131-154")
            }
        })

        b4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                color.setBackgroundColor(Color.parseColor("#9ca9bd"))
                color.setText("156-169-189")
            }
        })

        b5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                color.setBackgroundColor(Color.parseColor("#c4ccd4"))
                color.setText("196-204-212")
            }
        })

        b6.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                color.setBackgroundColor(Color.parseColor("#dee2e5"))
                color.setText("222-226-229")
            }
        })

    }
}