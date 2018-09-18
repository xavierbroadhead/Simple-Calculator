# Simple Calculator
A simple calculator app I made to practice using Java Swing after my first assignment using Swing. The assignment was a struggle as we hadn't been taught to use Swing yet, and I didn't like being thrown in the deep end, so I developed this in my spare time to ensure I was comfortable developing more complex GUIs in the future. 

![Calculator app in its current state](https://i.imgur.com/WaVahfC.png)


# A couple of notes about design
In its current state, the calculator allows for general integer and irrational arithmetic. Addition, subtraction, division, and multiplication are all properly implemented and (as far as I can tell) bug-free. 

I also added a copy/paste function, as it's something I realised a lot of calculators lack! It's such a small, but extremely useful function. 

# A few work-ons when I have time
- [ ] At the moment, you can type as many 0's as you like when there is nothing already input. This isn't super important, but it's a minor detail I'd like to fix in the future, as "00000" is the same as "0". I'm not sure how this works in Java, as the check I tried to add to counter this didn't work. Potentially something to do with holding an integer in a string. 

- [ ] I would like to add multiple operation calculations, that are only executed when the equals button is pressed, e.g. "23 x 4 + 2 / 3". Order of arithmetic is important to get perfect in this case, and it would be interesting to work out the algorithm for this. 

- [ ] I would also like to add capability for copying functions, for example copying "46 x 2" to use this in a separate calculation. 

- [ ] I would like to add parentheses buttons, once multiple operation calculations are implemented, this will be a real test of how perfect my BEDMAS algorithm is. 
