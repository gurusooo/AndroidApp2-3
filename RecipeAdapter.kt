package com.example.recipesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeAdapter(private val recipes: List<Recipe>) :
    RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {
        class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
          val recipeImage: ImageView = itemView.findViewById(R.id.recipeImage)
          val recipeTitle: TextView = itemView.findViewById(R.id.recipeTitle)
          val recipeDescription: TextView = itemView.findViewById(R.id.recipeDescription)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
          val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
          return RecipeViewHolder(view)
        }

        override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
          val recipe = recipes[position]
          holder.recipeImage.setImageResource(recipe.imgID)
          holder.recipeTitle.text = recipe.title
          holder.recipeDescription.text = recipe.description
        }

        override fun getItemCount(): Int = recipes.size
}
