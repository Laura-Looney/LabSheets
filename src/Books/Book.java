package Books;

public class Book
    {
        //State what info you wish to store
        private String Title;
        private String ISBN;
        private double Price;
        private int Pages;

        public Book() //no argument constructor. The default for no values.
            {
                Title = "Not Available";
                ISBN = "Not Available";
                Price = 00.00;
                Pages = 0;
            }

        //Being able to input data into this block
        public Book(String Title, String ISBN, double Price, int Pages)
            {
                setTitle(Title);
                setISBN(ISBN);
                setPrice(Price);
                setPages(Pages);
            }


        //This takes the data that was inputted from testBook(aka elsewhere)(Driver class)
        public String getTitle()
            {
                return Title;
            }

        public String getISBN()
            {
                return ISBN;
            }

        public double getPrice()
            {
                return Price;
            }

        public int getPages()
            {
                return Pages;
            }

        //This inputs the new gathered data into the variables to set a new object
        public void setTitle(String title)
            {
                Title = title;
            }

        public void setISBN(String ISBN)
            {
                this.ISBN = ISBN;
            }

        public void setPrice(double price)
            {
                Price = price;
            }

        public void setPages(int pages)
            {
                Pages = pages;
            }

        public String toString()
            {
                return "Title: " + Title + "\nISBN: " + ISBN + "\nPrice: " + Price + "\nPages: " + Pages;
            }
    }
