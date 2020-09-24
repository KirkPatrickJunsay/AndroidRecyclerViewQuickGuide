package com.example.myfirstrecyclerview.Model

class DataSource
{
    companion object
    {
        fun CreateDataSource() : ArrayList<NewsList>
        {
            var temp = ArrayList<NewsList>()

            temp.add(
                NewsList("https://homepages.cae.wisc.edu/~ece533/images/airplane.png","Airplane")
            )
            temp.add(
                NewsList("https://homepages.cae.wisc.edu/~ece533/images/arctichare.png","ArticHare")
            )
            temp.add(
                NewsList("https://homepages.cae.wisc.edu/~ece533/images/baboon.png","Baboon")
            )
            temp.add(
                NewsList("https://homepages.cae.wisc.edu/~ece533/images/boat.png","Boat")
            )
            temp.add(
                NewsList("https://homepages.cae.wisc.edu/~ece533/images/cat.png","Cat")
            )
            return temp
        }
    }
}