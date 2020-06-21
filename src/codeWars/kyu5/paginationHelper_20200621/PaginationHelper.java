package codeWars.kyu5.paginationHelper_20200621;

import java.util.List;

public class PaginationHelper<I> {

  public List<I> collection;
  public int itemsPerPage;

  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
  }

  public int itemCount() {
    return collection.size();
  }

  public int pageCount() {
    return collection.size() % itemsPerPage == 0 ? collection.size() / itemsPerPage
        : collection.size() / itemsPerPage + 1;
  }

  public int pageItemCount(int pageIndex) {
    int result = Math.min(itemCount(), itemsPerPage);
    int itemCount = itemCount() - result;
    for (int i = 0; i < pageIndex; i++) {
      result = Math.min(itemCount, itemsPerPage);
      itemCount -= result;
    }
    return result > 0 ? result : -1;
  }

  public int pageIndex(int itemIndex) {
    int page = -1;
    while (itemIndex >= 0) {
      itemIndex -= itemsPerPage;
      page++;
    }
    return page + 1 > pageCount() ? -1 : page;
  }
}
