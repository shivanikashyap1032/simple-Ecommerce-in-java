package ProductDetails;

public class Category {
    String categoryName;
    Category[] subCategories;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category[] getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Category[] subCategories) {
        this.subCategories = subCategories;
    }
}
