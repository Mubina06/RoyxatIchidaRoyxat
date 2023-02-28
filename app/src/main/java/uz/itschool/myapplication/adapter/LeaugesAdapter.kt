package uz.itschool.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import uz.itschool.myapplication.databinding.ChildItemBinding
import uz.itschool.myapplication.databinding.ParentActivityBinding

class LeaugesAdapter(
    var leauges : MutableMap<String, ArrayList<String>>, var leaugesTitle: ArrayList<String>) :
    BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return leaugesTitle.size
    }

    override fun getChildrenCount(p0: Int): Int {
        return leauges.get(leaugesTitle[p0])!!.size
    }

    override fun getGroup(p0: Int): String {
       return leaugesTitle[p0]
    }

    override fun getChild(p0: Int, p1: Int): Any {
        return leauges.get(leaugesTitle[p0])!!.get(p1)
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        position: Int,
        p1: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var binding : ParentActivityBinding
        if (convertView == null){
            binding = ParentActivityBinding.inflate(LayoutInflater.from(parent!!.context), parent, false)
        } else{
            binding = ParentActivityBinding.bind(convertView)
        }
        binding.parent.text =leaugesTitle.get(position)
        return binding.root
    }

    override fun getChildView(
        parentPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var binding : ChildItemBinding
        if (convertView == null){
            binding = ChildItemBinding.inflate(LayoutInflater.from(parent!!.context), parent, false)
        } else{
            binding = ChildItemBinding.bind(convertView)
        }
        binding.child.text =leauges.get(leaugesTitle[parentPosition])!!.get(childPosition)
        return binding.root
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
       return false
    }
}


//BaseExpandableListAdapter()
//
//Voris olinadi.
//
//override fun getGroupCount(): Int {
//    return leaugesTitle.size
//}
//
//royxat soni, purpldegi.
//
//override fun getChildrenCount(p0: Int): Int {
//    return leauges.get(leaugesTitle[p0])!!.size
//}
//
//royxat ichidagi royxat soni.
//
//override fun getGroup(p0: Int): String {
//   return leaugesTitle[p0]
//}
//
//Bitta group nomini olib beradi.
//
//override fun getChild(p0: Int, p1: Int): Any {
//    return leauges.get(leaugesTitle[p0])!!.get(p1)
//}
//
//Group ichidagi element nomini olib beradi.