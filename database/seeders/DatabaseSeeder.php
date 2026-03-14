<?php

namespace Database\Seeders;

use App\Models\Client;
use App\Models\Product;
use App\Models\Invoice;
use App\Models\InvoiceItem;
use App\Models\Payment;
use App\Models\User;
use Illuminate\Database\Seeder;

class DatabaseSeeder extends Seeder
{
    public function run(): void
    {
        $admin = User::factory()->create([
            'name' => 'Admin User',
            'email' => 'admin@facturacion.com',
        ]);

        $clients = Client::factory(10)->create();
        $products = Product::factory(15)->create();

        foreach ($clients as $client) {
            $invoice = Invoice::factory()->create([
                'client_id' => $client->id,
            ]);

            $numItems = rand(1, 5);
            for ($i = 0; $i < $numItems; $i++) {
                $product = $products->random();
                InvoiceItem::factory()->create([
                    'invoice_id' => $invoice->id,
                    'product_id' => $product->id,
                ]);
            }

            if (rand(0, 1)) {
                Payment::factory()->create([
                    'invoice_id' => $invoice->id,
                ]);
            }
        }
    }
}
