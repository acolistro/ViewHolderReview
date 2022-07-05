package com.example.viewholderreview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.viewholderreview.databinding.LandmarkWithImageBinding
import com.example.viewholderreview.databinding.LandmarkWithoutImageBinding

class LandmarkAdapter(private var landmarks: ArrayList<LandmarkDataModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var landmarkWithImageBinding: LandmarkWithImageBinding

    inner class LandmarkWithImageViewHolder(private val landmarkWithImage: LandmarkWithImageBinding) :
        RecyclerView.ViewHolder(landmarkWithImage.root) {
            fun bind(landmark: LandmarkDataModel) {
                landmarkWithImage.landmarkImage.setImageResource(landmark.resource!!)
                landmarkWithImage.landmarkWithImageTitle.text = landmark.title
                landmarkWithImage.landmarkWithImageDesc.text = landmark.desc
            }
        }

    inner class LandmarkWithoutImageViewHolder(private val landmarkWithoutImage: LandmarkWithoutImageBinding) :
        RecyclerView.ViewHolder(landmarkWithoutImage.root) {
            fun bind(landmark: LandmarkDataModel) {
                landmarkWithoutImage.landmarkTitle.text = landmark.title
                landmarkWithoutImage.landmarkDesc.text = landmark.desc
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int =landmarks.size
}
