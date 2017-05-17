<?= Form::create(["method"=>"POST", "action"=>"page.php"]) ?>
<?= Form::input(["type"=>"text", "name"=>"text"]) ?>
<?= Form::input(["type"=>"submit", "value"=>"Enviar"]) ?>
<?= Form::end() ?>