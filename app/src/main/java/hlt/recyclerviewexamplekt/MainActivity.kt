package hlt.recyclerviewexamplekt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)

        val items = ArrayList<MyAdapter.Item>()
        items.add(MyAdapter.Item("Bird", R.drawable.bird))
        items.add(MyAdapter.Item("Butterfly", R.drawable.butterfly))
        items.add(MyAdapter.Item("Chick", R.drawable.chicken))
        items.add(MyAdapter.Item("Wolf", R.drawable.wolf))

        viewAdapter = MyAdapter(items)

        recyclerView = findViewById<RecyclerView>(R.id.recyclerView).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}
