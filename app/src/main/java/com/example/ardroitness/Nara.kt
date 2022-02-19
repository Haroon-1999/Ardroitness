import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.ardroitness.Adapter.ItemAdapter
import com.example.ardroitness.R
import com.example.ardroitness.dataSource.DataSource

class Nara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val dataset = DataSource().loadNara()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, dataset)

        recyclerView.setHasFixedSize(true)
    }
}