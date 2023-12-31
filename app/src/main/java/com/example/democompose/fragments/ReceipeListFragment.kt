package com.example.democompose.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.democompose.R


class ReceipeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return  ComposeView(requireContext()).apply {
           setContent {
               Column(modifier = Modifier.padding(16.dp)) {
                   Text(text = "Happy Android",
                   style = TextStyle(fontSize = 16.sp)
                   )
                   Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(onClick = {
                        findNavController().navigate(R.id.receipeFragment)
                    }) {
                        Text(text = "OnClick")
                    }
               }
           }
        }
    }

}