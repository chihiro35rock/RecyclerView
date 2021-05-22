package app.mita.chatamin.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val courseData:List<CourseData> = listOf(
        CourseData(R.drawable.android,"Androidアプリプログラミングコース","色んなアプリを作って、プログラミングを楽しもう！"),
        CourseData(R.drawable.iphone,"iPhoneアプリプログラミングコース","世界にひとつだけのiPhoneアプリをつくって、周りを驚かせよう!")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(courseData)
    }
}