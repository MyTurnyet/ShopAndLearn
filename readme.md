[![Java CI with Gradle](https://github.com/MyTurnyet/ShopAndLearn/actions/workflows/gradle.yml/badge.svg)](https://github.com/MyTurnyet/ShopAndLearn/actions/workflows/gradle.yml)  

# ShopAndLearn
This is a practice application to allow us to work on and discuss the _How_ and the _Why_ of Object Oriented Design

### Assumptions
- All Code will have Unit Tests, Integration Tests and Functional Tests as appropriate
- Code will be in a continuous state of refactoring
- Code will be written in Java (although another language may be used for UI, if needed)


## Requirements
These are initial requirements and may change as neeed arises.

#### Shopping Cart
- Shopping cart will take 0-*N* shopping items
- Shopping Cart will return a detailed receipt with all items listed

#### Receipt
- Items will be listed by category 
- The receipt will show sub-totals, taxes added, and a total amount
- Any coupons or savings will be shown on the receipt at the bottom, but will be reflected in the totals

#### Store Specials
 - Store run specials may affect or change pricing of 0-*N* items
 
#### Payments
- Payments will be in US Dollars ($USD), but may someday be in other currencies.
- All pricing will always be in US Dollars ($USD)
- Taxes will be applied to items and will be as follows:
- All goods will be subject to a 10% Tax, except: 
    - Games
    - Food
    - Medical Products
- Imported goods will be subject to an additional 5% tax, *no exceptions*
- **Rounding** - all taxes will be rounded to the nearest $0.05
 
### Goods
Each good should have a SKU, Name, Category, and Price.

#### Initial Goods
These are the initial items that we will have available for the roll out.  The prices aren't set in stone yet, 
and we haven't come up with the store specials we'll be running.

| **SKU** | **Category** | **Name**  | **Price** | **Imported**
| :---: | :--- | :--- | :---: | :---:
| 1023 | Health | Bandages | $5.75 | 
| 2367 | Beauty | Perfume | $15.00 | Yes
| 3887 | Books | Elegant Objects Book  | $40.00 | 
| 4745 | Music | The Corona Virus Hits CD | $14.99 |
| 5291 | Food | Dutch Chocolate | $16.85 | Yes 
| 5634 | Food | Chocolates | $10.00 |  
| 6002 | Games | Monopoly | $12.95 |
| 6283 | Games | Obscure Japanses Board Game | 55.00 | Yes
