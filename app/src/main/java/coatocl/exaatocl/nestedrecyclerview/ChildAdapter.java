package coatocl.exaatocl.nestedrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder>
{
    private List<Child>childList;

    ChildAdapter(List<Child> childList) {
        this.childList = childList;
    }

    @NonNull
    @Override
    public ChildAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.child,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildAdapter.ViewHolder holder, int position)
    {
        Child child = childList.get(position);

        holder.categoryChild.setText(child.getCategory_child());
        holder.noteChild.setText(child.getNote_child());
        holder.accountChild.setText(child.getAccount_child());
        holder.amountChild.setText(child.getIncome_child());

    }

    @Override
    public int getItemCount() {
        return childList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {

        TextView categoryChild,noteChild,accountChild,amountChild;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryChild = itemView.findViewById(R.id.categoryChild);
            noteChild = itemView.findViewById(R.id.noteChild);
            accountChild = itemView.findViewById(R.id.accountChild);
            amountChild = itemView.findViewById(R.id.amountChild);

        }
    }
}
