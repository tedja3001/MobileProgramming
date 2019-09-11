package com.github.sutedjathehoping.loremgenerator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import android.view.View

import android.widget.AdapterView
import android.widget.ArrayAdapter

import androidx.databinding.DataBindingUtil
import com.github.sutedjathehoping.loremgenerator.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // Declaring Ipsums
    private val loremIpsum: Ipsum = Ipsum(
        "Lorem Ipsum",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis non fringilla tortor.\n" +
                "Integer luctus metus tortor, vitae accumsan nisl viverra sed. Cras ut finibus ligula, ut venenatis arcu.\n" +
                "Maecenas ut sollicitudin erat. Donec ullamcorper mi et nunc imperdiet, quis luctus dolor faucibus\n" +
                "Sed vitae pretium dui, vel aliquam nulla. Proin ornare dapibus dui vel convallis\n" +
                "Sed sit amet tincidunt orci, quis sollicitudin massa. Sed tincidunt sem placerat porta mattis.\n" +
                "Phasellus non vulputate metus, et vestibulum metus. Proin at faucibus ligula. Aenean eu aliquam lectus. Integer nec ex nulla.\n" +
                "Sed pharetra augue vel hendrerit bibendum. Nullam a enim id lacus efficitur rutrum.\n" +
                "Nunc urna orci, facilisis ac est quis, iaculis pellentesque nunc. Maecenas a eleifend velit.\n" +
                "Sed dui arcu, feugiat ac tempor quis, convallis vel orci. In ut urna nec ligula aliquam tempor eget vel augue.\n" +
                "Sed rhoncus porttitor magna non vestibulum. Suspendisse tempus nibh id nisi condimentum porta. Aenean vitae libero turpis.\n" +
                "In sapien libero, pharetra ut laoreet et, feugiat in nibh. Pellentesque lacus purus, euismod eu dui nec, convallis varius eros.\n" +
                " Aliquam at risus ligula. Suspendisse potenti. Fusce vulputate quam sit amet tortor auctor, ac dignissim lorem imperdiet.\n" +
                "Donec bibendum tellus orci, at congue ipsum faucibus pretium. Donec faucibus diam lectus, vel lobortis quam posuere nec.\n"
    )
    private val zombieIpsum: Ipsum = Ipsum(
        "Zombie Ipsum",
        "Zombie ipsum reversus ab viral inferno, nam rick grimes malum cerebro. De carne lumbering animata corpora quaeritis. Summus brains sit\u200B\u200B, morbo vel maleficia? De apocalypsi gorger omero undead survivor dictum mauris. Hi mindless mortuis soulless creaturas, imo evil stalking monstra adventus resi dentevil vultus comedat cerebella viventium. Qui animated corpse, cricket bat max brucks terribilem incessu zomby. The voodoo sacerdos flesh eater, suscitat mortuos comedere carnem virus. Zonbi tattered for solum oculi eorum defunctis go lum cerebro. Nescio brains an Undead zombies. Sicut malus putrid voodoo horror. Nigh tofth eliv ingdead.\n" +
                "\n" +
                "Cum horribilem walking dead resurgere de crazed sepulcris creaturis, zombie sicut de grave feeding iride et serpens. Pestilentia, shaun ofthe dead scythe animated corpses ipsa screams. Pestilentia est plague haec decaying ambulabat mortuos. Sicut zeder apathetic malus voodoo. Aenean a dolor plan et terror soulless vulnerum contagium accedunt, mortui iam vivam unlife. Qui tardius moveri, brid eof reanimator sed in magna copia sint terribiles undeath legionis. Alii missing oculis aliorum sicut serpere crabs nostram. Putridi braindead odores kill and infect, aere implent left four dead.\n"
    )

    private val cupcakeIpsum: Ipsum = Ipsum(
        "Cupcake Ipsum",
        "Cupcake ipsum dolor sit amet jelly beans dessert bonbon liquorice. Biscuit chocolate bar cake tootsie roll oat cake sweet roll cake. Chocolate bar gummi bears cake cake lollipop pastry cheesecake. Icing chupa chups lollipop dessert. Wafer chocolate bar sweet roll chocolate bar topping lollipop toffee. Danish tart cupcake wafer croissant marzipan lollipop biscuit. Chocolate bar bonbon chocolate halvah sesame snaps dragée pastry macaroon. Gummies cheesecake macaroon sesame snaps tootsie roll. Pie liquorice sweet danish ice cream cheesecake. Candy ice cream gummi bears toffee. Sugar plum topping sweet roll sweet roll dragée cake candy canes. Liquorice dragée cake.\n" +
                "\n" +
                "Candy canes gummi bears gummi bears icing halvah chupa chups halvah gummies. Marshmallow soufflé fruitcake sugar plum toffee pastry gingerbread. Gummies wafer brownie chupa chups marzipan ice cream gingerbread. Chocolate cake bear claw marzipan sugar plum chocolate cake. Caramels halvah apple pie gummies biscuit. Halvah gingerbread apple pie tart. Tootsie roll muffin apple pie. Cheesecake macaroon dragée liquorice caramels sweet roll tart jujubes. Soufflé sweet roll donut donut bear claw pie. Sesame snaps powder chupa chups gummies oat cake donut. Cookie danish pie toffee cupcake topping macaroon danish. Topping gummi bears gingerbread. Caramels chocolate lemon drops chocolate cake marzipan chocolate sesame snaps jujubes dessert. Danish candy bear claw. \n"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.loremIpsum = loremIpsum
        binding.cupcakeIpsum = cupcakeIpsum
        binding.zombieIpsum = zombieIpsum

        // Populating the Spinner
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.lorem_types, android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.loremSpinner.adapter = adapter

        binding.loremSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    val currentType: String =
                        binding.loremSpinner.getItemAtPosition(position).toString()
                    when (currentType) {
                        "Lorem Ipsum" -> {
                            binding.titleText.text = loremIpsum.type
                            binding.loremText.text = loremIpsum.content
                        }
                        "Zombie Ipsum" -> {
                            binding.titleText.text = zombieIpsum.type
                            binding.loremText.text = zombieIpsum.content
                        }
                        "Cupcake Ipsum" -> {
                            binding.titleText.text = cupcakeIpsum.type
                            binding.loremText.text = cupcakeIpsum.content
                        }
                    }
                }


                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Log.d(
                        "LoremGenerator :: ",
                        "onNothingSelected() is Called! Doing Absolutely Nothing...."
                    )
                }

            }


    }
}
