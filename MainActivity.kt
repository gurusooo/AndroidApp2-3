package com.example.recipesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recipesapp.ui.theme.RecipesAppTheme
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recipes = listOf(
            Recipe("Mulled Wine", R.drawable.p1_glintwein, "Mulled wine is a hot alcoholic drink based on wine, with the addition of fruits and spices. The simplest algorithm will lead you to an aromatic drink in just a few minutes: warm up the wine, add chopped fruits and spices, and then reheat to reveal flavors and exchange aromas. With this drink, autumn and winter evenings will become warmer."),
            Recipe("Carbonara", R.drawable.p2_carbonara, "A traditional dish for the Italian region of Lazio, pasta carbonara is a flavorful and satisfying combination of spaghetti, bacon and sauce. The dish is interesting because a rich sauce of eggs, Parmesan and black pepper is added to the finished hot spaghetti with bacon. The heat from the pasta allows the sauce to cook through."),
            Recipe("Pumkin Pie", R.drawable.p3_pumpkin_pie, "Pumpkin pie is a dessert pie with a spiced, pumpkin-based custard filling. The pumpkin and pumpkin pie are both a symbol of harvest time,and pumpkin pie is generally eaten during the fall and early winter. The pie's filling ranges in color from orange to brown and is baked in a single pie shell, usually without a top crust. The pie is generally flavored with pumpkin pie spice, a blend that includes cinnamon, ginger, nutmeg, and cloves or allspice. ")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recipesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecipeAdapter(recipes)
    }
}
