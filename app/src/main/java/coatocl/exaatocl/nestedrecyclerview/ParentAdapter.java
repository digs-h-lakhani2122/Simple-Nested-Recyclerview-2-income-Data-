package coatocl.exaatocl.nestedrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ViewHolder>
{
    private List<Parent>parentList;
    private RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();

    ParentAdapter(List<Parent> parentList) {
        this.parentList = parentList;
    }

    @NonNull
    @Override
    public ParentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.parent,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParentAdapter.ViewHolder holder, int position)
    {

        Parent parent = parentList.get(position);

        holder.dateParent.setText(parent.getDate_parent());
        holder.dayParent.setText(parent.getDay_parent());
        holder.month_yearParent.setText(parent.getMonth_year_parent());
        holder.incomeParent.setText(parent.getIncome_parent());
        holder.expenseParent.setText(parent.getExpense_parent());

        LinearLayoutManager layoutManager = new LinearLayoutManager(holder.recyclerViewParent.getContext(), LinearLayoutManager.VERTICAL, false);

        layoutManager.setInitialPrefetchItemCount(parent.getChildList().size());

        ChildAdapter childItemAdapter = new ChildAdapter(parent.getChildList());
        holder.recyclerViewParent.setLayoutManager(layoutManager);
        holder.recyclerViewParent.setAdapter(childItemAdapter);
        holder.recyclerViewParent.setRecycledViewPool(viewPool);

    }

    @Override
    public int getItemCount() {
        return parentList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView dateParent,dayParent,month_yearParent,incomeParent,expenseParent;
        RecyclerView recyclerViewParent;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            dateParent = itemView.findViewById(R.id.dateParent);
            dayParent = itemView.findViewById(R.id.dayParent);
            month_yearParent = itemView.findViewById(R.id.month_yearParent);
            incomeParent = itemView.findViewById(R.id.incomeParent);
            expenseParent = itemView.findViewById(R.id.expenseParent);
            recyclerViewParent = itemView.findViewById(R.id.recyclerViewParent);

        }
    }
}
