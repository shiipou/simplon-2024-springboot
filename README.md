# Shop Springboot

## Installation

## Contributing

### Understanding the class diagram :

```mermaidjs
classDiagram:
    class User {
        -Integer id
        -String username
    }
    class Product {
        -Integer id
        -String name
        -Float price
    }
    class Card {
        -Integer id
        -DateTime creationDate
        -List<Product> products
    }
    class Order {
        -Integer id
        -DateTime creationDate
        -List<Product> products
    }
```